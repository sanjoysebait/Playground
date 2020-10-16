#include <stdio.h>
float fahrenheit(float celsius);
float kelvin(float celsius);
int main()
{
    float celsius;
    scanf("%f",&celsius);
    printf("temperature in Fahrenheit %f\n", fahrenheit(celsius));
    printf("temperature in Kelvin %f", kelvin(celsius));
    return 0;
}
float fahrenheit(float celsius)
{
	int f;
  f=(9*celsius)/5+32;
  return f;
  //type your code here
}
float kelvin(float celsius)
{
	float k;
  k=celsius+273.149994;
  return k;//type your code here
}