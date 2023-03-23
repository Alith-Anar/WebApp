const tabTitle = document.querySelectorAll(".nav-item");
const tabContent = document.querySelectorAll(".tab-item");

tabTitle.forEach(item => item.addEventListener('click', event => {
    const tabTitleTarget = event.target.getAttribute('data-tab');

    tabTitle.forEach(element => element.classList.remove('active'));

    tabContent.forEach(element => element.classList.add('hidden'));

    item.classList.add('active');

    document.getElementById(tabTitleTarget).classList.remove('hidden');
}));

document.querySelector('[data-tab="all-prod-tab"]').classList.add('active');
document.querySelector('#all-prod-tab').classList.remove('hidden')