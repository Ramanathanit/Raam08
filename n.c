#include<stdio.h> 
#include<math.h>
 
int main()
{
    int n, i, sum = 0;
    
    printf("Enter a positive integer: ");
    scanf("%d",&n);
 
    for(i=1; i <= n; ++i)
    {
        sum += i;   // sum = sum+i;
    }
 
    printf("Sum = %d",sum);
 
   return 0;
}
