####

import socket

UDP_IP = "192.168.1.132"
UDP_PORT = 8010

print("UDP target IP: %s" % UDP_IP)
print("UDP target port: %s" % UDP_PORT)

sock = socket.socket(socket.AF_INET, # Internet
                     socket.SOCK_DGRAM) # UDP

sock.bind(('0.0.0.0', UDP_PORT))
data, addr = sock.recvfrom(1024) # buffer size is 1024 bytes
print("received message: %s" % data)
####