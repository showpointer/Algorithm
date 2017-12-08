#include <iostream>
using namespace std;

class tree_node {
private:
    int value;
    tree_node *parent;
    tree_node *left;
    tree_node *right;
public:
    tree_node(int val,tree_node *p=NULL,tree_node *l= NULL,tree_node *r= NULL) {
        this->value = val;
        this->parent = p;
        this->left = l;
        this->right = r;
    }
    int getValue() const{
        return value;
    }
    tree_node* getLeft() const {
        return left;
    }
    tree_node* getRight() const{
        return right;
    }
    tree_node* getParent() const{
        return parent;
    }

    bool isLeftExist() const{
        return left != NULL;
    }
    bool isRightExist() const{
        return right != NULL;
    }

    void setLeft(tree_node* left) {
        this->left = left;
    }
    void setRight(tree_node* right) {
        this->right = right;
    }
    void setParent(tree_node* parent) {
        this->parent = parent;
    }
};


class tree {
private:
    tree_node *root;
    tree_node *ptr;
    int size;
public:
    tree()
    {
        this->ptr = NULL;
        this->root = NULL;
        this->size = 0;
    }
    void search(tree_node *cur, int val) {
        if (cur->getValue() == val) {
            ptr = cur;
        }
        if (cur->isLeftExist()) {
            search(cur->getLeft(), val);
        }
        if (cur->isRightExist()) {
            search(cur->getRight(), val);
        }
    }
    void search_terminal(tree_node *cur) {
        ptr = cur;
        if (cur->isLeftExist()) {
            search_terminal(cur->getLeft());
        }
        if (cur->isRightExist()) {
            search_terminal(cur->getRight());
        }
    }
    tree_node* getRoot() const {
        return root;
    }
    void insert(int parent_value,int val) {
        tree_node *newNode = new tree_node(val);
        if (root == NULL) {
            root = newNode;
            return;
        }
        ptr = NULL;
        tree_node *Parent;
        search(root, parent_value);
        Parent = ptr;
        if (Parent == NULL) {
            // Parent Node not exist
            return;
        }
        else if (!Parent->isLeftExist()) {
            Parent->setLeft(newNode);
            newNode->setParent(Parent);
        }
        else if (!Parent->isRightExist()) {
            Parent->setRight(newNode);
            newNode->setParent(Parent);
        }
        else {
            // parent node has left,right node
        }
    }

    void deletion(int val) {
        tree_node *remove_node=NULL;
        search(root, val);
        remove_node = ptr;
        if (remove_node == NULL) {
            // node is not exist
            return;
        }
        // Restructuring
        tree_node *remove_parent = remove_node->getParent();

        if (remove_node->getLeft() == NULL &&remove_node->getRight() == NULL) {
            // this node is leaf/terminal node
            int LR = (remove_parent->getRight() == remove_node);
            if (LR == 0) {
                remove_parent->setLeft(NULL);
            }
            else if (LR == 1) {
                remove_parent->setRight(NULL);
            }
            // 제거되는 노드가 root인 경우
            if (remove_parent == NULL) {

                delete remove_node;
                root = NULL;
            }
        }
        else if(!(remove_node->getLeft() && remove_node->getRight())){
            // has only one child
            int remove_child_LR = (remove_node->getLeft() == NULL); // remove node has left node? right node? [Left : 0 , Right : 1 ]
            tree_node *remove_child = (remove_child_LR == 0) ? remove_node->getLeft() : remove_node->getRight();
            if (remove_parent == NULL) {
                // this is root node
                root = remove_child;
                root->setParent(NULL);
                delete remove_node ;
                return;
            }
            int LR = (remove_parent->getRight()==remove_node); // left node? right node? [ Left : 0, Right : 1 ]
            remove_child->setParent(remove_parent);
            if (LR == 0) {
                remove_parent->setLeft(remove_child);
            }
            else if (LR == 1) {
                remove_parent->setRight(remove_child);
            }
        }
        else {
            // has two node
            tree_node *swapnode=NULL;
            search_terminal(remove_node);
            swapnode = ptr;
            tree_node *swap_parent=swapnode->getParent();
            tree_node* left = remove_node->getLeft();
            tree_node* right = remove_node->getRight();
            if (swap_parent != NULL) {
                int swap_LR = (swap_parent->getRight() == swapnode);
                if (swap_LR == 0) {
                    swap_parent->setLeft(NULL);
                }
                else if (swap_LR == 1) {
                    swap_parent->setRight(NULL);
                }
            }
            if (left != swapnode)
            {
                swapnode->setLeft(left);
                left->setParent(swapnode);
            }
            if (right != swapnode) {
                swapnode->setRight(right);
                right->setParent(swapnode);
            }
            swapnode->setParent(remove_node->getParent());
            if (remove_parent != NULL) {
                int LR = (remove_parent->getRight() == remove_node);
                if (LR == 0) {
                    remove_parent->setLeft(swapnode);
                }
                else if (LR == 1) {
                    remove_parent->setRight(swapnode);
                }
            }
            if (remove_parent == NULL)
            {
                root = swapnode;
            }
        }
        delete remove_node;
    }

    void pre_order(tree_node *cur) {
        cout << cur->getValue() << ' ';
        if (cur->isLeftExist()) {
            pre_order(cur->getLeft());
        }
        if (cur->isRightExist()) {
            pre_order(cur->getRight());
        }
    }
    void in_order(tree_node *cur) {
        if (cur->isLeftExist()) {
            in_order(cur->getLeft());
        }
        cout << cur->getValue() << ' ';
        if (cur->isRightExist()) {
            in_order(cur->getRight());
        }
    }
    void post_order(tree_node *cur) {
        if (cur->isLeftExist()) {
            post_order(cur->getLeft());
        }
        if (cur->isRightExist()) {
            post_order(cur->getRight());
        }
        cout << cur->getValue() << ' ';
    }

};


int main()
{
    tree tr;
    tr.insert(-1, 0);
    tr.insert(0, 1);
    tr.insert(0, 2);
    tr.insert(1, 3);
    tr.insert(1, 4);
    tr.insert(2, 5);
    tr.insert(2, 6);
    tr.insert(3, 7);
    cout << "tree pre-order result : ";
    tr.pre_order(tr.getRoot());
    cout << endl << "tree in-order result : ";
    tr.in_order(tr.getRoot());
    cout << endl << "tree post-order result : ";
    tr.post_order(tr.getRoot());
    cout << endl;

    return 0;
}
	