
const shopContent = document.getElementById('shopcontent');

productos.forEach((product) => { 
    const content = document.createElement('div');
    content.innerHTML = `
    <img src="${product.img}">
    <h3>${product.productname}</h3>
    <p>${product.price}</p>
    `;
    shopContent.append(content);
});
