md5-hash:
	CGO_ENABLED=0 GOARCH=amd64 GOOS=linux go build -ldflags '-w' -a -installsuffix cgo .

clean: 
	rm md5-hash

docker:
	docker build -t md5-hash .

install: md5-hash docker

all: clean install