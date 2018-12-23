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

# Samples

