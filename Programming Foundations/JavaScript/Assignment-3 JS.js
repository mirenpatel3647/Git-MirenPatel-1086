/*
1. Employee Salary Processor
• Filter employees with salary greater than 40,000
• Increase their salary by 10%
• Add a new property:
• "level":
o salary ≥ 70000 → "Senior"
o else → "Mid"

• Return a new array (do not modify original)
*/

const employees=[
    {
        name:"Miren",
        salary:80000
    },
    {
        name:"Smit",
        salary:45000
    },
    {
        name:"Shyam",
        salary:40000
    },
    {
        name:"Kirtan",
        salary:30000
    }
];
console.log(employees);

let filteredEmployees=employees.filter((emp)=>{
    return emp.salary>40000;
});
console.log(filteredEmployees);

let increaseSalary=filteredEmployees.map((emp)=>{
    let increment=emp.salary*1.10;
    return{
        ...emp,
        IncreaseSalary:increment
    }
});
console.log(increaseSalary);


function addProperty(empDetails){
// console.log(empDetails);
return empDetails.map((emp)=>{
    if(emp.salary>70000){
    return{
        ...emp,
        level:"Senior"
    }
}
else{
    return{
        ...emp,
        level:"Mid"
    }
}
})
}

let addProperyEmployee=addProperty(increaseSalary);
console.log(addProperyEmployee);


//Another for add property 
/*
let addProperyEmployee1=employees.map((emp)=>{
    if(emp.salary>=70000){
        return{
            ...emp,
            level:"Senior"
        }
    }
    else{
        return{
            ...emp,
            level:"Mid"
        }
    }
});
console.log(addProperyEmployee1);
*/


/*
2. Order Management System
For each order:
1. Calculate total amount
2. Calculate total items quantity
3. Return new array:

4. Using the above assignments, turn into a single mini web app (UI + JS)
*/
let orders=[
    {
        item:"AC",
        quantity:4,
        price:40000
    },
    {
        item:"Mouse",
        quantity:5,
        price:400
    },
    {
        item:"Keyboard",
        quantity:10,
        price:500
    },
    {
        item:"Mobile",
        quantity:4,
        price:30000
    }
];
console.log(orders);

// let totalAmount=0;

// orders.forEach((item)=>{
//     totalAmount=totalAmount+(item.price*item.quantity);  
// });

let newArray=orders.map((emp)=>{
    return{
        ...emp,
        TotalAmount:emp.price*emp.quantity
    }
})
console.log(newArray);


// let totals=newArray.reduce((res, curr)=>{

// }, )

let totalAmountCart=0, totalQuantityCart=0;
newArray.forEach((item)=>{
    totalQuantityCart=totalQuantityCart+item.quantity;
    totalAmountCart=totalAmountCart+item.price;
})
console.log("Total Quantity:"+totalQuantityCart, " Total Amount:"+totalAmountCart);


