class Node:
    
    def __init__(self, item):
        self.data = item
        self.left = None
        self.right = None
        
    def size(self):
        l = self.left.size() if self.left else 0
        r = self.right.size() if self.right else 0
        return l + r + 1
    
    def depth(self):
        leftDepth = self.left.depth() if self.left else 0
        rightDepth = self.right.depth() if self.right else 0
        return leftDepth + 1 if leftDepth > rightDepth else rightDepth + 1

    def preorder(self):
        travarsal = []
        travarsal.append(self.data)
        self.left.travarsal += self.left.preorder()
        self.right.travarsal += self.right.preorder()
        return travarsal
        
    def inorder(self):
        travarsal = []
        self.left.travarsal += self.left.inorder()
        travarsal.append(self.data)
        self.right.travarsal += self.right.inorder()
        return travarsal
    
    def postorder(self):
        travarsal = []
        self.left.travarsal += self.left.postorder()
        self.right.travarsal += self.right.postorder()
        travarsal.append(self.data)
        return travarsal
    
    def insert(self, key, data):
        if key < self.key:
            if self.left:
                self.left.insert(key, data)
            else:
                self.left = Node(key, data)
        elif key > self.key:
            if self.right:
                self.right.insert(key,data)
            else:
                self.right = Node(key, data)
        else:
            raise KeyError("already exist")
        
    def countChild(self):
        count = 0
        if self.left:
            count+=1
        if self.right:
            count+=1
        return count

    def lookup(self, key, parent=None):
        if key<self.key:
            if self.left:
                return self.left.lookup(key, self)
            else:
                return None, None
        elif key>self.key:
            if self.right:
                return self.right.lookup(key, self)
            else:
                return None, None
        else:
            return self, parent
    
class BinaryTree:
    
    def __init__(self, r):
        self.root = r
    
    def size(self):
        if self.root:
            return self.root.size()
        else:
            return 0
    
    def depth(self):
        if self.root:
            return self.root.depth()
        else:
            return 0
    def preorder(self):
        if self.root:
            return self.root.preorder()
        else:
            return []
    def inorder(self):
        if self.root:
            return self.root.inorder()
        else:
            return []
    def postorder(self):
        if self.root:
            return self.root.postorder()
        
    def insert(self, key, data):
        if self.root:
            self.root.insert(key, data)
        else:
            self.root = Node(key, data)

    def remove(self, key):
        node, parent = self.lookup(key)
        if node:
            nChild = node.countChild()
            
            if nChild==0:
                if parent:
                    if parent.left == node:
                        parent.left=None
                    else:
                        parent.right=None
                else:
                    self.root = None
            
            elif nChild==1:
                if parent:
                    if node.left:
                        if parent.left==node:
                            parent.left==node.left
                        else:
                            parent.right=node.right
                    else:
                        if parent.left==node:
                            parent.left==node.right
                        else:
                            parent.right=node.right
                else:
                    if node.left:
                        self.root = node.left
                    else:
                        self.root = node.right
            else:
                parent = node
                successor = node.right
                
                while successor.left:
                    parent = successor
                    successor = successor.left
                
                node.key = successor.key
                node.data = successor.data
                
                if parent.left == successor:
                    if successor.right:
                        parent.left = successor.right
                    else:
                        parent.left = None
                else:
                    if successor.right:
                        parent.right = successor.right
                    else:
                        parent.right = None
                
            return True
        else:
            return False
                        
                            
                    
    
    
    
        