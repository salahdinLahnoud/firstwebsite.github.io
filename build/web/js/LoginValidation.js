/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function checkForBlank() {
    
    if (document.getElementById('username').value == " ") {

        alert('voer username please !');
        document.getElementById('username').style.borderColor= red;
        return false;
    }

}