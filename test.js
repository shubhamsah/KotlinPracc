// test-file.js
function badFunction() {
    let x = 10;
if (x === 5)
        console.log("This is wrong");
    // Missing return statement
}

let unusedVar = "hello";

function isUserAdmin(user) {
  return user && user.role === 'admin';
}
  if (user && user.role === 'admin') {
    return true;
  }
  return false;
}

const result = isUserAdmin({ name: 'Alice', role: 'user' });
if (result) {
  console.log('Admin access granted');
}
