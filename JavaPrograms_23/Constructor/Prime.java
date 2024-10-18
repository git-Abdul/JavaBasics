package Constructor;
class Prime {
    int n;
    Prime() {
        n = 0;
    }
    void input(int x) {
        n=x;
    }
    void display() {
        int i;
        int f = 0;
        for(i = 1; i<=n; i++) {
            if(n%i == 0) {
                f++;
            }
        }
        if(f>2) {
            System.out.print("Normal");
        }
        else 
            System.out.print("Prime");
    }
}