// Last updated: 7/22/2025, 3:15:24 PM
/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {

   var n=x.toString();
   var result=n.split("").reverse().join("");
   return n===result; 
};