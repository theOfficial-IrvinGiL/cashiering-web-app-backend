package com.cashieringsystembackend.cashieringsystem.role;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

	private final RoleRepository roleRepository;

	@Autowired
	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	public Optional<Role> fetchRoleById(Long id) {
		return roleRepository.findById(id);
	}
}
