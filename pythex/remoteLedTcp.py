####

import socket

TCP_IP = "192.168.1.132"
TCP_PORT = 8010

print("TCP target IP: %s" % TCP_IP)
print("TCP target port: %s" % TCP_PORT)

sock = socket.socket(socket.AF_INET, # Internet
                     socket.SOCK_STREAM) # UDP
sock.connect((TCP_IP, TCP_PORT))
print("1 - on")
print("2 - off")
print("3 - getState")

choice = ""
while choice != "exit":
    choice = input("Choose 1-3 or type 'exit': ")
    if choice != "exit":
        if choice == '1':
            sock.sendall(b"on\n")
        elif choice == '2':
            sock.sendall(b"off\n")
        elif choice == '3':
            sock.sendall(b"getState\n")
            asw = sock.recv(1024)
            print(asw.decode("utf-8"))
        print("1 - on")
        print("2 - off")
        print("3 - getState")
    
####