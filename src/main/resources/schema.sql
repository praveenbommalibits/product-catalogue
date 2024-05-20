CREATE TABLE PRODUCT (
                         productId INT AUTO_INCREMENT PRIMARY KEY,
                         productName VARCHAR(255),
                         price DOUBLE,
                         color VARCHAR(255),
                         brand VARCHAR(255),
                         size INT,
                         sku VARCHAR(255)
);

CREATE TABLE SELLER (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        sellerName VARCHAR(255),
                        productId INT,
                        quantity INT,
                        FOREIGN KEY (productId) REFERENCES PRODUCT(productId)
);
