# Spring Batch 

**This example imports a flat file into a database (spring-batch-java-02)**

* Java annotation based spring boot application
* Spring batch application which imports a flat file into a database table
* Sqlite has separate database to store meta-data tables and user tables
* Flat file contains Person details like firstname, lastname and date of birth
* Batch contain a job and a single step (step1)
* Step use a FlatFileItemReader, Processor and JdbcBatchItemWriter
