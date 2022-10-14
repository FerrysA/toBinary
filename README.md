# toBinary
##14.10.22
##Перевод из десятичной в двоичную
## [ссылка на задачу](https://www.codewars.com/kata/59fca81a5712f9fa4700159a)
## реализация
*public static int toBinary(int n) {

*        double res = 0;
*        double st = 1;
*       double pow2 = 1;
*        double r = n;
 *       while (r > 0) {
  *          st = (int) (Math.log10(r) / Math.log10(2));
   *         pow2 = Math.pow(2, st);
    *        r = r - pow2;
     *       res += (int) Math.pow(10, st);
      *  }
       * return (int) res;
    *}
#Понравивщееся решение Автор ayaka14732
*if(n == 0) return 0;
*   else return 10 * toBinary(n / 2) + n % 2;    
