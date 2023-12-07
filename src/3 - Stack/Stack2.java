class Stack2 {

  static final int MAX = 1000;
  int top;
  int a[] = new int[MAX]; // Maximum size of Stack

  boolean isEmpty() {
    return (top < 0);
  }

  Stack2() {
    top = -1;
  }

  boolean push(int x) {
    if (top >= MAX) {
      System.out.println("Stack Overflow");
      return false;
    } else {
      a[++top] = x;
      return true;
    }
  }

  int pop() {
    if (top < 0) {
      System.out.println("Stack Underflow");
      return 0;
    } else {
      int x = a[top--];
      return x;
    }
  }

  int peek() {
    return a[top];

  }
}