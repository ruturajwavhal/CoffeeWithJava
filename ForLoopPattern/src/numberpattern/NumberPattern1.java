/**
 *
 * here we are printing below Star pattern using for_loop
    1
    12
    123
    1234
    12345
 */

void main() {
    for (int i = 1; i <= 5; i++){
        for(int j = 1; j <= i; j++){
            IO.print(j);
        }
        IO.println();
    }
}
