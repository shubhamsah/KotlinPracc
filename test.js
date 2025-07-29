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

function isUserAdmin(user) {
  if (user && user.role === 'admin') {
    return true;
  }
  return false;
}

const result = isUserAdmin({ name: 'Alice', role: 'user' });
if (result) {
  console.log('Admin access granted');
}
