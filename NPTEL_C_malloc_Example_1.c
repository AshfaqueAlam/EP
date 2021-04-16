/*
Example of malloc.
*/

#include <stdio.h>
#include <stdlib.h>

int main() {
    int i, N;
    float *height;
    float sum = 0, avg;

    printf("Input the number of students: ");
    scanf("%d", &N);

    height = (float *)malloc(N * sizeof(float));

    printf("\nInput height for %d students: ", N);
    for (i = 0; i < N; i++)
        scanf("%f", &height[i]);

    for (i = 0; i < N; i++)
        sum += height[i];

    avg = sum / (float)N;

    printf("Average height = %f", avg);
    return 0;
}
