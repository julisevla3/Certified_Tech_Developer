
const darkMode = () => {
    document.querySelector("body").classList.add("body-dark");
    document.querySelector("h1").classList.add("family-felinos")
    const items = document.querySelectorAll(".item")
    items.forEach(item => {
        item.classList.add("modify-itens")
    })
    const textFields = document.querySelectorAll("h2, p")
    textFields.forEach(item => {
        item.classList.add(".modify-text")
    })
}

const lightMode = () => {
    document.querySelector("body").classList.remove("dark-mode-background");
    document.querySelector("h1").classList.remove("dark-mode-title")
    const items = document.querySelectorAll(".item")
    items.forEach(item => {
        item.classList.remove("dark-mode-item")
    })
    const textFields = document.querySelectorAll("h2, p")
    textFields.forEach(item => {
        item.classList.remove("dark-mode-text")
    })
}