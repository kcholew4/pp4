async const logProducts = async () => {
    const res = await fetch("/api/products");
    const products = await res.json();
    console.log(products);
    return products;
}