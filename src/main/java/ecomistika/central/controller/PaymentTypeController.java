package ecomistika.central.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ecomistika.central.model.PaymentMethod;
import ecomistika.central.service.IPaymentMethodService;


import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/paymenttypes")
public class PaymentTypeController {
   

    @Autowired
    IPaymentMethodService paymentMethodService;

    @GetMapping("")
    public List<PaymentMethod> getAllPaymentMethod() {
        return paymentMethodService.getAllPaymentMethods();
    }

    @GetMapping("/{id}")
    public Optional<PaymentMethod> getPaymentMethodById(@PathVariable Long id) {
        return paymentMethodService.getPaymentMethodById(id);
    }

    @PostMapping("")
    public PaymentMethod createPaymentMethod(@RequestBody PaymentMethod paymentMethod) {
        return paymentMethodService.createPaymentMethod(paymentMethod);
    }

    @PutMapping("/{id}")
    public PaymentMethod updatePaymentMethod(@PathVariable Long id, @RequestBody PaymentMethod updatedPaymentMethod) {
        return paymentMethodService.updatePaymentMethod(id, updatedPaymentMethod);
    }

    @DeleteMapping("/{id}")
    public void deletePaymentMethod(@PathVariable Long id) {
        paymentMethodService.deletePaymentMethod(id);
    }
    
}
