#include<stdio.h>

int main(){
    int n=10;

    pbv(n);

  //  printf("%d",n);

    pbr(&n);

   // printf("%d",n);

    int x[5] = {10, 20, 30, 40, 50};
  int* ptr;

  // ptr is assigned the address of the third element
  ptr = &x[2];

  printf("*ptr = %d \n", *ptr);   // 3
  printf("*(ptr+1) = %d \n", *(ptr+1)); // 4
  printf("*(ptr-1) = %d", *(ptr-1));  // 2
}


void pbv(int n){

    n=2020;

}

void pbr(int *np){
   // printf("%d",*np);//this will print address
    *np=4040;
   //  printf("%d",*np);
}
