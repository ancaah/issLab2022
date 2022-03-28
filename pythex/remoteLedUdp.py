####

import socket

UDP_IP = "192.168.1.132"
UDP_PORT = 8010

print("UDP target IP: %s" % UDP_IP)
print("UDP target port: %s" % UDP_PORT)

sock = socket.socket(socket.AF_INET, # Internet
                     socket.SOCK_DGRAM) # UDP

print("1 - on")
print("2 - off")
print("3 - getState")

choice = ""
while choice != "exit":
    choice = input("Choose 1-3 or type 'exit': ")
    if choice != "exit":
        if choice == '1':
            sock.sendto(b"on", (UDP_IP, UDP_PORT))
        elif choice == '2':
            sock.sendto(b"off", (UDP_IP, UDP_PORT))
        elif choice == '3':
            sock.sendto(b"getState", (UDP_IP, UDP_PORT))
        print("1 - on")
        print("2 - off")
        print("3 - getState")
    
####