Before starting, get ([Postman](https://www.getpostman.com/)) REST client.
Import project jpa_labs.json.

# Database

The currently used database is [H2](http://www.h2database.com/).

H2 console is accessible by using : http://localhost:8050/h2-console/

# REST API

Microservice repositories can be checked through : http://localhost:8050/

Each repository is automatically added to the existing REST API.

```javascript
{
  "_links" : {
    "myEntities" : {
      "href" : "http://localhost:8050/myEntities{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://localhost:8050/profile"
    }
  }
}
```

# Exercises

SQL generated by ORM are displayed in microservice logs. Don't hesitate to check.
Import jpa_labs.json into Postman.

## Relationship

1. Create a one to one relationship from Immortal to Sword. Use H2 console to check the result.
2. Create a bidirectional many to many relationship between immortal and quickening. Only intermediary table containing only once primary key from immortal and from quickening.
3. Add a field annotated by @Version in Sword. Create one and update it. Check in H2 console that versioned field has been updated.

## Query

1. Create a JPQL query computing the total quickening of an immortal (method name: *getTotalQuickeningById*)
2. In ImmortalRepository, write a native query (method name: *findFullById*) that will result into ImmortalView
