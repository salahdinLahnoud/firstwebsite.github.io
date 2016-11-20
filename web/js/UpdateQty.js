/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


            function increment() {
            var countBox = document.getElementById('count');
            
                    var count = countBox.innerHTML;
                    
                     count++;
                     if(count > 20){
                         
                         var count = 20;
                      
                     }
                    countBox.innerHTML = count;
                    
            }
            function decrement() {
             var countBox = document.getElementById('count');
                     var count = countBox.innerHTML;
                     count--;
                     if (count < 0){
                         
                       var count = 0;
                     }
                    countBox.innerHTML = count;
                     }