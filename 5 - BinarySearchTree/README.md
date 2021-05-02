# Binary Search Tree

Binary Search Tree, node’lardan oluşan ve her bir node’un en fazla 2 child node’a sahip olduğu veri yapılarından bir tanesidir.
Node Nedir? ....
[yazının devamı...](https://tsafaelmali.medium.com/binary-search-tree-nedir-2e6fb0621d9)

```java
class Node {
    constructor(value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BST {
    constructor() {
        this.root = null;
    }

    create(value) {
        const newNode = new Node(value);

        if (!this.root) {
            this.root = newNode;
            return this;
        } else {
            this.insertNode(this.root, newNode);
        }

        return this;
    }

    insertNode(currentNode, node) {
        if (node.value < currentNode.value) {
            if (currentNode.left === null) {
                currentNode.left = node;
            } else {
                this.insertNode(currentNode.left, node);
            }
        } else {
            if (currentNode.right === null) {
                currentNode.right = node;
            }
            else {
                this.insertNode(currentNode.right, node);
            }
        }
    }

    find(val) {
        if (!this.root) {
            return "There is no Root!";
        } else {
            const found = this.findNode(this.root, val);
            if (!found) {
                return "There is no such node in this tree!";
            }

            return found;
        }
    }

    findNode(currentNode, value) {
        if (currentNode.value === value) {
            return currentNode;
        } else if (value < currentNode.value && currentNode.left != null) {
            return this.findNode(currentNode.left, value);
        } else if (value > currentNode.value && currentNode.right != null) {
            return this.findNode(currentNode.right, value);
        }

        return null;
    }

    findMinNode() {
        if (!this.root) return null;

        let current = this.root;

        while (current.left) {
            current = current.left;
        }

        return current;
    }

    findMaxNode() {
        if (!this.root) return null;

        let current = this.root;

        while (current.right) {
            current = current.right;
        }

        return current;
    }

    inOrder = function () {
        this.getInOrder(this.root);
    }

    getInOrder = function (node) {
        if (node.left != null) {
            this.getInOrder(node.left);
        }

        console.log(node.value);

        if (node.right != null) {
            this.getInOrder(node.right);
        }
    }
}

const tree = new BST();
tree.create(10)
    .create(21)
    .create(5)
    .create(32);

tree.inOrder();

```


## İkili Arama Ağacı
Düğüm yapısı kendisinden büyük ve kendisinden küçük olan düğümler için iki farklı işaretçi (pointer) ve düğüm verisinden oluşur. Bu yapı içine veri olarak başka değişkenler de tanımlanabilir.
....[yazının devamı...](https://notpast.com/c_programlama/Ikili-Arama-Agaci-Binary-Search-Tree-76.html)


![](http://sercancetin.com/wp-content/uploads/2017/01/ikili-a%C4%9Fa%C3%A7-yap%C4%B1s%C4%B1.png)

## İkili Arama Ağacı  Hakkında Yazılmış Yazılar

[Binary Search Tree' yi Anlamak](https://www.buraksenyurt.com/post/Binary-Search-Tree-yi-Anlamak)

[bilgisayarkavramlari.com/](http://bilgisayarkavramlari.com/2008/05/07/ikili-arama-agaci-binary-search-tree/)

[sercancetin.com/](http://sercancetin.com/ikili-arama-agaclari-olusturma-ornegi/)

