store.getElementById("loginForm").addEventListener("submit", function(event) {
    

    var username = store.getElementById("username").value;
    var password = store.getElementById("password").value;

    if (username == "Yash Bhindia" && password == "1234") {

        store.getElementById("loginMessage").innerText = "Login successful!";

        } else {

        store.getElementById("loginMessage").innerText = "Incorrect username or password.";

        }
});