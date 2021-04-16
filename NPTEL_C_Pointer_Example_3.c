/*
Example of Complex number addition.
*/

#include <stdio.h>

struct complex {
    float re, im;
};

struct complex add(x, y) struct complex x, y;
{
    struct complex t;

    t.re = x.re + y.re;
    t.im = x.im + y.im;
    return t;
}

int main() {
    struct complex a, b, c;
    scanf("%f %f", &a.re, &a.im);
    scanf("%f %f", &b.re, &b.im);
    c = add(a, b);
    printf("\n%f %f", c.re, c.im);
    return 0;
}

// --------------------------------------------

/*
Example of Complex number addition using POINTERS.
*/

#include <stdio.h>

struct complex {
    float re, im;
};

void add(x, y, t) struct complex *x, *y, *t;
{
    t->re = x->re + y->re;
    t->im = x->im + y->im;
}

int main() {
    struct complex a, b, c;
    scanf("%f %f", &a.re, &a.im);
    scanf("%f %f", &b.re, &b.im);
    add(&a, &b, &c);
    printf("%f %f", c.re, c.im);
    return 0;
}
