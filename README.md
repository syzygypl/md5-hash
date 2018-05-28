# md5-hash

## About

This is a small app that's used to get md5 hash out of provided string and append it with @example.com

## Building

To build this project run the following command:

```console
make all
```

This will provide a docker image with all the necessary components inside it.

To run it:

```console
docker run --rm -ti -p 3000:3000 md5-hash
```
