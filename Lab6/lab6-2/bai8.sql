SELECT 
CASE 
WHEN a+b<=c or b+c<=a or c+a<=b 
then "Not A Triangle" 
when a=b and b=c 
then "Equilateral" 
when a=b or b=c or a=c 
then "Isosceles" when a!=b and b!= c then "Scalene" end from Triangles;