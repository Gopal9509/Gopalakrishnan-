let currentInput='';
let oper=null;
let firstNumber=null;
 function number(n){
	currentInput=currentInput+n;
	document.getElementById('display').value=currentInput;
 }
 function operator(op){
	if(firstNumber===null){
		firstNumber=parseFloat(currentInput);
		currentInput='';
	}else if(currentInput !==''){
		calculate();
		firstNumber=parseFloat(currentInput);
		currentInput='';
	}
	oper=op;
	document.getElementById('display').value='';
 }
 function clear(){
	currentInput='';
	firstNumber=null;
	oper=null;
	document.getElementById('display').value='';
 }
 function calculate(){
	if(firstNumber!==null && oper!==null && currentInput!==''){
	   const secondNumber=parseFloat(currentInput);
	   let result=0;
	     if(oper=== '+'){
			result=firstNumber+secondNumber;
		 }else if(oper=== '-'){
			result=firstNumber-secondNumber;
		}else if(oper=== '*'){
			result=firstNumber*secondNumber;
		}else if (oper === '/') {
		      if (secondNumber !== 0) {
		        result = firstNumber / secondNumber;
		      } else {
		        result = 'Error';
		      }
			  }
			  currentInput = result.toString();
			     document.getElementById('display').value = currentInput;

			     firstNumber = null;
			     oper = null;
	}
 }
 
 
