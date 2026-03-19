//Assignment 1: Smart Discount Calculator

let userName="Miren"
let age=17
let purchaseAmount=6000
let discount=0

if(age<18)
{
    discount=discount+10
}
else if(age>=60){
    discount=discount+20
}

if(purchaseAmount>5000 && (age<18 || age>=60)){
    discount=discount+5
}
else if(purchaseAmount>5000){
    discount=discount+5
}

let finalAmount=purchaseAmount-((purchaseAmount*discount)/100)
console.log(discount);
console.log(finalAmount);

console.log(`Hi ${userName}! You recieved a total discount of ${discount}%. Final Amount:₹${finalAmount}`);



//Assignment 2: Login Validation System
let preDefinedUserName1="mirenpatel"
let preDefinedPassword1="miren@1234"

let userDefinedUserName2="mirenpatel"
let userDefinedPassword2="miren@1234"

if(preDefinedUserName1==userDefinedUserName2 && preDefinedPassword1==userDefinedPassword2){
    console.log("Login Successful!");
}
else if(preDefinedUserName1!==userDefinedUserName2){
    console.log("Login Unsuccessful! You are entered wrong username!");
}
else if(preDefinedPassword1!==userDefinedPassword2){
    console.log("Login Unsuccessful! You are entered wrong password!");   
}
else{
    console.log("Login Unsuccessful! Both are wrong!");   
}


//Assignment 3: Number Analyzer Tool
let number=-12;
console.log(number);

if(number>0){
    if(number%2==0){
        console.log(`The number ${number} is positive and even.`);
    }
    else{
        console.log(`The number ${number} is positive and odd.`);
    }
}
else if(number<0){
    if(number%2==0){
        console.log(`The number ${number} is negative and even.`);
    }
    else{
        console.log(`The number ${number} is negative and odd.`);
    }
}
else{
    console.log(`The number ${number} is positive and even.`);
}


//Assignment 4: Shopping Eligibility Checker
let isMember=true;
let cartValue=2200;

if((isMember && cartValue>1000) || cartValue>2000){
    console.log("You are eligible for free delivery!");
}
else{
    console.log("Delivery charge can be applicable!");
}



// Assignment 5: Grade Evaluation System
let marks=10;
let grade;
if(marks<0 || marks>100){
    console.log("Invalid marks entered.");
}
else{
    if(marks>=90){
        grade="A";
    }
    else if(marks>=75 && marks<=89){
        grade="B";
    }
    else if(marks>=50 && marks<=74){
        grade="C";
    }
    else{
        // console.log("You are failed!");
        grade="Fail";
    }
    // console.log(`Your grade is ${grade}.`);
}

if(grade=="Fail"){
    console.log(`You are Failed!`);
}
else if(grade=="A" || grade=="B" || grade=="C"){
    console.log(`Your grade is ${grade}.`);
}

