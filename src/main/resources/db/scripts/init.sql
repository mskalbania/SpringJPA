CREATE TABLE purchase(
  id INTEGER PRIMARY KEY,
  purchaser VARCHAR(30),
  purchaseDate DATE,
);
CREATE TABLE item(
  id INTEGER PRIMARY KEY,
  purchaser VARCHAR(30),
  price DECIMAL
);
CREATE TABLE purchases(
  purchaseID INTEGER NOT NULL,
  itemID INTEGER NOT NULL,
  FOREIGN KEY (purchaseID) REFERENCES purchase(id),
  FOREIGN KEY (itemID) REFERENCES item(id)
);