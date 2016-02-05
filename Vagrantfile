# -*- mode: ruby -*-
# vi: set ft=ruby :

VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.ssh.insert_key = false
  config.vm.provider :virtualbox do |vb|
    vb.customize ["modifyvm", :id, "--memory", "2048"]
  end

  # Cluster Node 1
  config.vm.define "node1" do |node1|
    node1.vm.hostname = "akka-cluster-node1.dev"
    node1.vm.box = "bento/centos-7.1"
    node1.vm.network :private_network, ip: "192.168.10.4"
  end

  # Cluster Node 2
  config.vm.define "node2" do |node2|
    node2.vm.hostname = "akka-cluster-node2.dev"
    node2.vm.box = "bento/centos-7.1"
    node2.vm.network :private_network, ip: "192.168.10.5"
  end

  # Cluster Node 3
  config.vm.define "node3" do |node3|
    node3.vm.hostname = "akka-cluster-node3.dev"
    node3.vm.box = "bento/centos-7.1"
    node3.vm.network :private_network, ip: "192.168.10.6"
  end

  # Relational Database server
  config.vm.define "db" do |db|
    db.vm.hostname = "akka-relational-db.dev"
    db.vm.box = "bento/centos-7.1"
    db.vm.network :private_network, ip: "192.168.20.100"
  end

  if Vagrant.has_plugin?("vagrant-cachier")
    config.cache.scope = :box
  end
end