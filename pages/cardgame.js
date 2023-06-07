
document.getElementById("points-1").style.display = "none";  
document.getElementById("points-2").style.display = "none";  
document.getElementById("highest-card-1").style.display = "none";  
document.getElementById("highest-card-2").style.display = "none";  

    function clickBtnOne() {
    var points = document.getElementById("points-1");
    if (points.style.display === "none") {
        points.style.display = "block";
    }
    var card = document.getElementById("highest-card-1");
    if (card.style.display === "none") {
        card.style.display = "block";
    }
}
function clickBtnTwo() {
    var points = document.getElementById("points-2");
    if (points.style.display === "none") {
        points.style.display = "block";
    }
    var card = document.getElementById("highest-card-2");
    if (card.style.display === "none") {
        card.style.display = "block";
    }
}