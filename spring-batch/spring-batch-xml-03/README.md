# Spring Batch 

**This example imports data from a database table to a flat file (spring-batch-xml-03)**

* Spring XML configuration based java application
* Spring batch application imports a database table to a flat file (XML)
* H2 database contains both the spring batch meta-data tables and user tables
* Batch contain a job and a single step (step1)
* Step use a JdbcCursorItemReader, BeanPropertyRowMapper, PersonItemProcessor and StaxEventItemWriter
