/*
NPTEL C Pointer example :- [Red Diary 30 July]
*/

#include <stdio.h>

int main(){
    int x,y;
    int *ptr;

    x=10;
    ptr=&x;
    y=*ptr;
    printf("\n%d is stored in location %x\n",x,&x);
    printf("%d is stored in location %x\n",*&x,&x);          // *&x == x
    printf("%d is stored in location %x\n",*ptr,ptr);        // ptr = &x; && x == &*ptr
    printf("%d is stored in location %x\n",y,&*ptr);
    printf("%x is stored in location %x\n",ptr,&ptr);
    printf("%d is stored in location %x\n",y,&y);

    *ptr=25;
    printf("Now x = %d\n\n", x);
    return 0;
}
