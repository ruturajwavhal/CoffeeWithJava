/**
 *
 * here we are printing below Star pattern using for_loop
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */

void main() {

    for (int i = 1; i <= 5; i++){
        for (int j = 1; j <= i; j++){
            IO.print("* ");
        }
        IO.println();
    }
}
