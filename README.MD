# TestAssessment API Document

# API

## Books

### <code>GET</code> /api/books

`getListBooks`

- Parameter

  | attribute | description | required | default |
  | --------- | ----------- | -------- | ------- |
  | `title`   | Title       | false    |         |

- Response (application/json)

  - success response

    ```
     [
        {
            "id": 1,
            "title": "new Book",
            "description": "Funny Book",
            "published": true
        },
        {
            "id": 2,
            "title": "new Book2",
            "description": "Sad Book",
            "published": true
        }
    ]
    ```

### <code>GET</code> /api/books/{id}

`getBookById`

- Parameter

  | attribute | description | required | default |
  | --------- | ----------- | -------- | ------- |
  | `id`      | ID          | true     |         |

- Response (application/json)

  - success response

    ```
    {
        "id": 1,
        "title": "new Book",
        "description": "Funny Book",
        "published": false

    }
    ```

### <code>POST</code> /api/books

`createBook`

- Parameter(multipart/form)

  | attribute     | description             | required | default |
  | ------------- | ----------------------- | -------- | ------- |
  | `title`       | Title                   | true     |         |
  | `description` | Description             | true     |         |
  | `published`   | The status of published | true     |         |

- Response (application/json)

  - success response
    ```
    {
        "id": 1,
        "title": "new Book",
        "description": "Funny Book",
        "published": true
    }
    ```

### <code>DELETE</code> /api/books/{id}

`deleteBook`

- Parameter

  | attribute | description | required | default |
  | --------- | ----------- | -------- | ------- |
  | `id`      | Book ID     |          |         |

- Response (application/json)

  - success response

```

```
