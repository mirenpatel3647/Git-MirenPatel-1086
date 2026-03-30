/*
1: Student Report System
Calculate average marks for each student
Add a new property average using map()
Assign result:
• Avg ≥ 75 → "Distinction"
• Avg ≥ 50 → "Pass"
• Else → "Fail"
*/

let studentsDetails=[
    {
        name:"Miren",
        marks:[80, 70, 85, 90]
    },
    {
        name:"Smit",
        marks:[60, 50, 55, 40]
    },
    {
        name:"Kirtan",
        marks:[30, 40, 55, 35]
    }
];
console.log(studentsDetails);


let newArray=studentsDetails.map((student)=>{
   let totalMarks= student.marks.reduce((total, curr)=>{
        return total+curr;
    },0);

    let averageMarks=totalMarks/student.marks.length;

    let result;
    if(averageMarks>=75){
        result="Distinction";
    }
    else if(averageMarks>=50){
        result="Pass";
    }
    else{
        result="Fail";
    }

    return{
        ...student,
        TotalMarks:totalMarks,
        AverageMarks:averageMarks,
        Result:result
    }
})
console.log(newArray);


/*
2: Shopping Cart Analyzer
Calculate total bill
Return:
• Total amount
• Total quantity of items
Use rest operator to accept multiple items
*/

function getItems(...items){
    //console.log(items);

    let totalQuantity=0, totalAmount=0;

    items.forEach((element)=>{
        totalQuantity=totalQuantity+element.quantity;
        totalAmount=totalAmount+(element.quantity*element.price);
    })
    return{
        TotalQuantity:totalQuantity,
        TotalAmount:totalAmount
    }
}
let bill=getItems(
    {
        item:"Mobile",
        quantity:20,
        price:30000
    },
    {
        item:"Printer",
        quantity:30,
        price:5000
    },
    {
        item:"Mouse",
        quantity:25,
        price:400
    },
);

console.log(bill);


/*
3: User Profile Updater
Create a function to:
• Update city
• Add new property profession
Use spread operator
Do NOT modify original object
*/

let users=[
    {
        name:"Miren",
        city:"Vadodara"
    },
    {
        name:"Smit",
        city:"Ahemdabad"
    },
    {
        name:"Kirtan",
        city:"Modasa"
    }
];
console.log(users);

function updateDetails(newCity, Profession){
    return users.map((user)=>{
         return {
        ...user,
        city:newCity,
        Profession:Profession
    }
    })
}
let updatedUsers=updateDetails("Dhansura", "Full-Stack Developer")
console.log(updatedUsers);



/*
4: Product Filter & Transform
Filter products with price > 1000
Use map() to:
• Add discountedPrice (10% off)
Return new array
*/

let products=[
    {
        name:"AC",
        quantity:2,
        price:40000
    },
    {
        name:"Remote",
        quantity:2,
        price:400
    },
    {
        name:"Airdopes",
        quantity:3,
        price:1500
    },
    {
        name:"Type C Cable",
        quantity:4,
        price:300
    }
];
console.log(products);

let filterdProducts=products.filter((item)=>{
    return item.price>1000;
});
console.log(filterdProducts);

let discountedPrice=products.map((item)=>{

    let discount= item.price*0.10;
    return {
        ...item,
        discountedPrice:item.price-discount
    }
});
console.log(discountedPrice);


/*
5: Dynamic Number Processor
Separate:
• Even numbers
• Odd numbers
Also calculate:
• Sum of even numbers
• Sum of odd numbers
*/

let numbers=[10, 29, 40, 56, 58, 55, 25, 30];
console.log(numbers);

let evenNumbers=numbers.filter((num)=>{
    return num%2==0;
});
console.log(evenNumbers);


let oddNumbers=numbers.filter((num)=>{
    return num%2!=0;
});
console.log(oddNumbers);

let sumOfEvenNumbers=evenNumbers.reduce((total, curr)=>{
    return total=total+curr;
},0);
console.log(sumOfEvenNumbers);

let sumOfOddNumbers=oddNumbers.reduce((total, curr)=>{
    return total=total+curr;
},0);
console.log(sumOfOddNumbers);


