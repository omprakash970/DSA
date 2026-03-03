//write a binary tree class in c++
#include <iostream>
#include <queue>
using namespace std;
class Node {
public:
    int data;
    Node* left;
    Node* right;
    Node(int value) {
        data = value;
        left = nullptr;
        right = nullptr;
    }
};
class BinaryTree {
public:
    Node* root;
    BinaryTree() {
        root = nullptr;
    }
    void insert(int value) {
        root = insertRec(root, value);
    }
    Node* insertRec(Node* node, int value) {
        if (node == nullptr) {
            return new Node(value);
        }
        if (value < node->data) {
            node->left = insertRec(node->left, value);
        } else if (value > node->data) {
            node->right = insertRec(node->right, value);
        }
        return node;
    }
    void inorder() {
        inorderRec(root);
    }
    void inorderRec(Node* node) {
        if (node != nullptr) {
            inorderRec(node->left);
            cout << node->data << " ";
            inorderRec(node->right);
        }
    }
};
void inorder(Node*node){
    if(!node) return; 
    inorder(node->left); 
    cout<<node->data<<" ";
    inorder(node->right);

}

void preorder(Node*node){
    if(!node) return; 
    cout<<node->data<<" ";
    preorder(node->left); 
    preorder(node->right);
}
void postorder(Node*node){
    if(!node) return; 
    postorder(node->left);
    postorder(node->right);
    cout<<node->data<<" ";
}
void levelOrder(Node* node){
    if(!node) return; 
    queue<Node*>q; 
    q.push(node); 
    while(!q.empty()){
        Node*node=q.front(); 
        q.pop();
        cout<<node->data<<" ";
        if(node->left) q.push(node->left);
        if(node->right) q.push(node->right);
    }

}