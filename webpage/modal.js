// Get the openModal button
var openModalBtn = document.getElementById('openModalLoginForm');

//Get the closeModal button
var closeModalBtn = document.getElementById('closeModalLoginForm');

// Get the modal
var modal = document.getElementById('modalLoginForm');

// When the user clicks on the openModal button, open the modal
openModalBtn.onclick = function openModal() {
    modal.style.display = "block";
}

//When the user clicks on the closeModal button, close the modal
closeModalBtn.onclick = function closeModal() {
    modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function closeModal(event) {
    if (event.target == modal) {
    	modal.style.display = "none";
    }
}