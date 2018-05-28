FROM scratch

ADD md5-hash /md5-hash
ADD login.gtpl /login.gtpl

CMD ["/md5-hash"]