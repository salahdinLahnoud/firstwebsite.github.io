function validateAll()
{
fid.style.visibility="hidden";
deptid.style.visibility="hidden";
classid.style.visibility="hidden";
stuid.style.visibility="hidden";
var b1=validateFN();
var b2=validateDept(); 
var b3=validateClass();
var b4=validatestuid();
var b=(b1&&b2&&b3&&b4); 
if(b) print(); 
return b;
}
//***************Validate Full Name 
function validateFN()
{
var s=f.ftext.value; 
if(s=="")
{
fid.innerText="* please enter your name";
fid.style.visibility="visible";
return (false);
}
if(parseInt(s)>=0)
{
fid.innerText="* please your name must be a string of character";
fid.style.visibility="visible";
return (false);
}
return (true); 
} 
//***************Validate Student Id
function validatestuid()
{
var s=f.stext.value; 
if(s=="")
{
stuid.innerText="* please enter your name";
stuid.style.visibility="visible";
return (false);
}
if(isNaN(parseInt(s)))
{
stuid.innerText="* please your name must be a number";
stuid.style.visibility="visible";
return (false);
}
return (true); 
}
//***************Validate Department 
function validateDept() 
{
var s=f.dept.value; 
if(s=="ch")
{
deptid.innerText="* please choose your department";
deptid.style.visibility="visible"; 
return (false);
}
return (true); 
}
//******************Validate Class
function validateClass()
{
var s=f.rad1.checked || f.rad2.checked || f.rad3.checked;
if(s==false) 
{
classid.innerText="* please choose your class"; 
classid.style.visibility="visible";
return (false); 
}
return(true);
}
//***************Print Information into Table 
function print()
{
s_id.innerText=f.stext.value;
t_fn.innerText=f.ftext.value;
t_dept.innerText=f.dept.value;
//
if(f.rad1.checked)
t_class.innerText=f.rad1.value;
else if(f.rad2.checked)
t_class.innerText=f.rad2.value;
else if(f.rad3.checked)
t_class.innerText=f.rad3.value;
// 
if(f.ch1.checked)
t_h.innerText=f.ch1.value+" ";

if(f.ch2.checked)
t_h.innerText+=f.ch2.value+" ";

if(f.ch3.checked)
t_h.innerText+=f.ch3.value+" ";

if(f.ch4.checked)
t_h.innerText+=f.ch4.value+" ";
}