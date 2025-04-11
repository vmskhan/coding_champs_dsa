void MyQueue ::push(int x) {
    // Your Code
    
        arr[rear]=x;
        rear=(rear+1)%100005;
}

// Function to pop an element from queue and return that element.
int MyQueue ::pop() {
    // Your Code
    int res=front==rear?-1:arr[front];
    if(res!=-1)
        front=(front+1)%100005;
    return res;
}
