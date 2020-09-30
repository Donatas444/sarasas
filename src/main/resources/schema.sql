
CREATE TABLE tableList
(
    rowId varchar(100) NOT NULL,
    rowContent varchar (11) NOT NULL,
    deadline varchar(100) DEFAULT NULL,
    rowCondition varchar(100) DEFAULT NULL,
    PRIMARY KEY (rowId)
);

SELECT * FROM tableList;

