/*
NPTEL C Pointer example - 2:- [Red Diary 29 July]
*/

#include <stdio.h>

float avg(int array[], int size);

int main() {
    int x[100], k, n;
    scanf("%d", &n);
    
    for (k = 0; k < n; k++)
        scanf("%d", &x[k]);
    
    printf("\nAverage is %f", avg(x, n));
    return 0;
}
float avg(int array[], int size) {
    int *p, i, sum = 0;
    p = array;
    for (i = 0; i < size; i++)
        sum = sum + *(p + i);
    return ((float)sum / size);
}
