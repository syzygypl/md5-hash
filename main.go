package main

import (
	"crypto/md5"
	"encoding/hex"
	"fmt"
	"html/template"
	"net/http"
	"strings"
)

func getMD5Hash(text string) string {
	hash := md5.Sum([]byte(text))
	return hex.EncodeToString(hash[:])
}

func loginHasher(w http.ResponseWriter, r *http.Request) {
	if r.Method == "GET" {
		t, _ := template.ParseFiles("login.gtpl")
		t.Execute(w, nil)
	} else {
		r.ParseForm()
		s := strings.Join(r.Form["username"], "")
		body := getMD5Hash(s)
		body += "@example.com"
		fmt.Fprintf(w, body)
	}
}

func main() {
	http.HandleFunc("/", loginHasher)
	http.ListenAndServe(":3000", nil) // setting listening port
}
