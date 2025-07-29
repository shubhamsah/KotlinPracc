// test-file.js
function badFunction() {
    var x = 10;  // Should use const/let
    if (x = 5) { // Assignment instead of comparison
        console.log("This is wrong");
    }
    // Missing return statement
}

// Unused variable
let unusedVar = "hello";